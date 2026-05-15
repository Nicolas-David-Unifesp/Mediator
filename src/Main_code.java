import java.util.ArrayList;
import java.util.List;



public class Collaborators_code {// Classe principal para testar o padrão Mediator
    public static void main(String[] args) {
        ConcreteCollaborator1 alice = new ConcreteCollaborator1("Alice");
        ConcreteCollaborator2 bob = new ConcreteCollaborator2("Bob");

        ConcreteMediator mediator = new ConcreteMediator();
        mediator.addCollaborator(alice);
        mediator.addCollaborator(bob);

        alice.sendMessage("Olá, Bob!");
        bob.sendMessage("Oi, Alice! Tudo certo?");
    }
}