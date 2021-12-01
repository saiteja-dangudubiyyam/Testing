package org.example.consumer;
import java.util.function.Consumer;
public class LoginConsumer {
    public final static Consumer<LoginPage> name=n->n.enterName();
    public final static Consumer<LoginPage> email=n->n.enterEmail();
    public final static Consumer<LoginPage> password=n->n.enterPassword();

    public final static Consumer<LoginPage> SUCCESS=n->name.andThen(email).andThen(password).accept(n);
    public final static Consumer<LoginPage> INVALID=n->name.andThen(password).andThen(email).accept(n);
}
