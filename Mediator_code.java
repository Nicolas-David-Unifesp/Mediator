import java.util.ArrayList;
import java.util.List;

interface Mediator {
    void sendMessage(String message, Collaborator sender);
    void addCollaborator(Collaborator collaborator);
    void removeCollaborator(Collaborator collaborator);
    void notifyCollaborators(String message, Collaborator sender);
    void clearAllCollaborators();
}

class ConcreteMediator implements Mediator {
    private final List<Collaborator> collaborators = new ArrayList<>();

    public ConcreteMediator() {
    }

    @Override
    public void sendMessage(String message, Collaborator sender) {
        for (Collaborator collaborator : collaborators) {
            if (collaborator != sender) {
                collaborator.receiveMessage(message);
            }
        }
    }

    @Override
    public void addCollaborator(Collaborator collaborator) {
        if (collaborator == null || collaborators.contains(collaborator)) {
            return;
        }
        collaborators.add(collaborator);
        collaborator.setMediator(this);
    }

    @Override
    public void removeCollaborator(Collaborator collaborator) {
        collaborators.remove(collaborator);
    }

    @Override
    public void notifyCollaborators(String message, Collaborator sender) {
        sendMessage("[NOTIFICAÇÃO] " + message, sender);
    }

    @Override
    public void clearAllCollaborators() {
        collaborators.clear();
    }
}
