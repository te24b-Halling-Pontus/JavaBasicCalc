

String[] operators = { "Addition", "Suptraktion", "Multiplikation", "Divition" };

void main() {
    int operatorChoice = 6;
    IO.println("Meny:");
    for (int i = 1; i <= operators.length; i++) {
        IO.println(i + ". " + operators[i - 1]);
    }
    boolean temp = true;
    while (temp) {
        operatorChoice = Math.round(StringToFloat("Vall av räknesätt:") - 1);
        if (operatorChoice > 0 && operatorChoice < 4) {
            temp = false;
        }
        else{
            IO.println("du kan bara välja mellan 1 och 4 ");
        }
    }
    IO.println("Du valde " + operators[operatorChoice]);
    float number1 = StringToFloat("Första Talet: ");
    float number2 = StringToFloat("Andra talet: ");

    switch (operatorChoice) {
        case 1 -> Add(number1, number2);
        case 2 -> Sub(number1, number2);
        case 3 -> Mult(number1, number2);
        case 4 -> Div(number1, number2);
    }
}

static void Add(float number1, float number2) {
    IO.println(number1 + number2);
}

static void Sub(float number1, float number2) {
    IO.println(number1 - number2);
}

static void Mult(float number1, float number2) {
    IO.println(number1 * number2);
}

static void Div(float number1, float number2) {
    IO.println(number1 / number2);
}

static float StringToFloat(String s_number) {
    boolean temp = true;
    float number = 1;
    while (temp) {
        try {
            number = Float.parseFloat(IO.readln(s_number));
            temp = false;
        } catch (Exception e) {
            IO.println("Skriv inga bokstäver eller något dumt");
        }
    }
    return (number);
}
