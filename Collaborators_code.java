import Mediator_code.Mediator;
import Mediator_code.ConcreteMediator;




export public abstract class Collaborator {
    private Mediator mediator;
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}



public class ConcreteCollaborator1 extends Collaborator {
    public String name;
    public int id;
    public ConcreteCollaborator1(String name) {
        this.name = name;
        this.id = 1;
    }
    public void receiveMessage(String message) {
        mediator.sendmessage(message, this);
    }
    public void sendMessage(String message) {
        mediator.sendmessage(message, this);
    }
    public void clearCollaborators() {
        mediator.clear_all_Collaborators();
    }
    public void notifyCollaborators(String message) {
        mediator.notifyCollaborators(message, this);
    }
    public void removeCollaborator() {
        mediator.removeCollaborator(this);
    }
    public void addCollaborator(Collaborator collaborator) {
        mediator.addCollaborator(collaborator);
    }
    
}

public class ConcreteCollaborator2 extends Collaborator {
    public String name;
    public int id;
    public ConcreteCollaborator2(String name) {
        this.name = name;
        this.id = 2;
    }
    public void receiveMessage(String message) {
        mediator.sendmessage(message, this);
    }
    public void sendMessage(String message) {
        mediator.sendmessage(message, this);
    }
    public void clearCollaborators() {
        mediator.clear_all_Collaborators();
    }
    public void notifyCollaborators(String message) {
        mediator.notifyCollaborators(message, this);
    }
    public void removeCollaborator() {
        mediator.removeCollaborator(this);
    }
    public void addCollaborator(Collaborator collaborator) {
        mediator.addCollaborator(collaborator);
    }

}