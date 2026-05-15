import java.util.ArrayList;
import java.util.List;

interface Mediator {
    void sendMessage(String message, Collaborator sender);
    void addCollaborator(Collaborator collaborator);
    void removeCollaborator(Collaborator collaborator);
    void notifyCollaborators(String message, Collaborator sender);
    void clearAllCollaborators();
}//Efetuada a interface do Mediador com os métodos necessários.

class ConcreteMediator implements Mediator {
    private final List<Collaborator> collaborators = new ArrayList<>();
    //Coloca numa lista para armazenar os colaboradores. Mais fácil de implementar os métodos de envio, notificação e remoção.
    public ConcreteMediator() {
    }

    @Override
    public void sendMessage(String message, Collaborator sender) {
        for (Collaborator collaborator : collaborators) {
            if (collaborator != sender) {//O que enviou não recebe a própia mensagem.
                collaborator.receiveMessage(message);
            }//Aqui a mensagem é enviada para todos os colaboradores.
        }
    }

    @Override
    public void addCollaborator(Collaborator collaborator) {
        if (collaborator == null || collaborators.contains(collaborator)) {
            return;//Verifica se é nulo ou já tá na lista.
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
