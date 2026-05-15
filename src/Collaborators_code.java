abstract class Collaborator {// Classe abstrata para os colaboradores
    protected Mediator mediator;
    protected String name;
    protected int id;

    public Collaborator(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }// Método para enviar mensagens através do Mediator

    public void sendMessage(String message) {
        if (mediator == null) {
            System.out.println(name + " não está conectado a um Mediator.");
            return;//Verifica se o colaborador não está conectado a um colaborador
        }
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " recebeu: " + message);
    }

    public void clearCollaborators() {
        if (mediator != null) {
            mediator.clearAllCollaborators();
        }//Aqui verifica se o colaborador está concetado a um mediador para depois limpar tudo na lista.
    }

    public void notifyCollaborators(String message) {
        if (mediator != null) {
            mediator.notifyCollaborators(message, this);
        }//Só manda a notificação para os outros colaboradores se o colaborador estiver conectado a um mediador.
    }

    public void removeCollaborator() {
        if (mediator != null) {
            mediator.removeCollaborator(this);
        }
    }

    public void addCollaborator(Collaborator collaborator) {
        if (mediator != null) {
            mediator.addCollaborator(collaborator);
        }
    }
}

class ConcreteCollaborator1 extends Collaborator {
    public ConcreteCollaborator1(String name) {
        super(name, 1);
    }//Implementação do colaborador concreto 1
}

class ConcreteCollaborator2 extends Collaborator {
    public ConcreteCollaborator2(String name) {
        super(name, 2);
    }
}
