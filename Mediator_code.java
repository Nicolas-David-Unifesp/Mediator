interface Mediator {
    public void sendmessage(String message, Collaborator sender);
    public void addCollaborator(Collaborator collaborator);
    public void removeCollaborator(Collaborator collaborator);
    public void notifyCollaborators(String message, Collaborator sender);
    public void clear_all_Collaborators();
}

public class ConcreteMediator implements Mediator {
    Collaborator collaborator1;
    Collaborator collaborator2;

    public ConcreteMediator(Collaborator collaborator1, Collaborator collaborator2) {
        this.collaborator1 = collaborator1;
        this.collaborator2 = collaborator2;
        this.collaborator1.setMediator(this);
        this.collaborator2.setMediator(this);
    }

    public void setCollaborator1(Collaborator collaborator1) {
        this.collaborator1 = collaborator1;
        this.collaborator1.setMediator(this);
    }

    public void setCollaborator2(Collaborator collaborator2) {
        this.collaborator2 = collaborator2;
        this.collaborator2.setMediator(this);
    }

    @Override
    public void sendmessage(String message, Collaborator sender) {
        if (sender == collaborator1) {
            collaborator2.receiveMessage(message);
        } else if (sender == collaborator2) {
            collaborator1.receiveMessage(message);
        }
    }

    @Override
    public void addCollaborator(Collaborator collaborator) {
        /*if (collaborator1 == null) {
        //    setCollaborator1(collaborator);
        //} else if (collaborator2 == null) {
        //    setCollaborator2(collaborator);
        //} else {
        //    setCollaborator1(collaborator);
            setCollaborator2(collaborator);
        } */

        
    }

    @Override
    public void removeCollaborator(Collaborator collaborator) {
        // Implement collaborator removal logic here
    }

    @Override
    public void notifyCollaborators(String message, Collaborator sender) {
        // Implement collaborator notification logic here
    }

    @Override
    public void clear_all_Collaborators() {
        // Implement collaborator clearing logic here
    }
}