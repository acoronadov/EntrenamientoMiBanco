package org.example.Question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.example.ui.HomePage;
import org.example.ui.ResultadosPage;

public class homeDataLambda {

    public static Question<String> nameValue() {
    return actor -> TextContent.of(ResultadosPage.LBLResultado).viewedBy(actor).asString();
    }

    public static Question<String> msgErrorValue() {
        return actor -> TextContent.of(ResultadosPage.txtMsgError).viewedBy(actor).asString();
    }
}
