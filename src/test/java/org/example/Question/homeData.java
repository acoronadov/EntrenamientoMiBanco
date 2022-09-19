package org.example.Question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import org.example.ui.ResultadosPage;

@Subject("Mensaje de Bienvenida")
public class homeData implements Question<String> {

    public static homeData Name() {
        return new homeData();
    }

    public homeData() {
    }

    @Override
    public String answeredBy(Actor actor) {
        return actor.asksFor(TheTarget.textOf(ResultadosPage.LBLResultado));
    }
}
