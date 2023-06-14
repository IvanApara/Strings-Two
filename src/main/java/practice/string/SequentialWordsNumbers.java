package practice.string;

public class SequentialWordsNumbers {


    public static String sequentialWordsNumbers(String text){
//        String proposal = " Это просто текст, для примера работы программы";
        int index = 0;

        int i = 0;
        int number = 0;
        StringBuilder builder = new StringBuilder();
        String finish = "";


        while (index >= 0){
            if (text.isEmpty()) {
                break;
            }
            number++;
            if (!text.contains(" ")){
                builder.append("(").append(String.valueOf(number)).append(") ").append(text);
                break;
            }
            index = text.indexOf(' ', index + 1);
            if( index == -1){
                index = 0;
                index = text.lastIndexOf(' ');
                String resul = text.substring(index);
                builder.append("(").append(String.valueOf(number)).append(")").append(resul);
                break;
            } else if (index >= 3 && index <= 8 ) {
                String result = text.substring(i ,index);
                builder.append("(").append(String.valueOf(number)).append(") ").append(result + " ");

            } else{
                String result = text.substring(i ,index);

                builder.append("(").append(String.valueOf(number)).append(")").append(result + " ");
            }


            i = index;

        }

        finish += builder;


        return finish;
    }
}
