String[] operators = { "Addition", "Suptraktion", "Multiplikation", "Divition" };

void main() {
    int operatorChoice = 6;
    IO.println("Meny:");
    for (int i = 1; i <= operators.length; i++) {
        IO.println(i + ". " + operators[i - 1]);
    }
    boolean ss = true;
    while (ss) {
        operatorChoice = Math.round(S("Vall av räknesätt") - 1);
        if (operatorChoice > 0 && operatorChoice < 4)
        {
            ss = false;
        }
    }
    IO.println("Du valde " + operators[operatorChoice]);
    float number1 = S("Första Talet: ");
    float number2 = S("Andra talet: ");

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

static float S(String s_number) {
    boolean ss = true;
    float number = 1;
    while (ss) {
        try {
            number = Float.parseFloat(IO.readln(s_number));
            ss = false;
        } catch (Exception e) {
            IO.println("Skriv inga bokstäver eller något dumt");
        }
    }
    return (number);
}