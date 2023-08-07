public class Main {
    @Override
    public int hashCode() {
        return super.hashCode() * 31;
    }



    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.



//        String[] literals = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "ч", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
        int maxValue = Character.MAX_VALUE;
//        System.out.println(maxValue);
//        for (int i = 0; i < maxValue; i++) {
//            char symbol = (char) i;
//            String strChar = new String(String.valueOf(symbol));
//            for (int j = 0; j < literals.length; j++) {
//                if (literals[j].equalsIgnoreCase(strChar)) {
//                    System.out.println(strChar + " " + i);
//
//                }
//            }
//
//        }
        // Был такой план, но кажется при его реализации я столкнулся с проблемой переопределение иквалза
        // и хэшкода (не помню как это делается, поэтому и не решил спешить). Тут кажется коллизия



        for (int i = 1040; i <= 1103; i ++){
            char symbol = (char) i;
            System.out.println(symbol);
        }
        for (int i = 0; i <= maxValue; i ++){
            char symbol = (char) i;
            if  (symbol == 'ё' ||symbol == 'Ё'){
                System.out.println(symbol);
            }
        }
    }
}
