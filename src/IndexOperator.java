public class IndexOperator {


    public static int getIndexOperator(String str) {
        char[] opArray = {'+','-','*','/'};
        int indexOperator = 0;
        for (int i = 0; i < opArray.length; i++) {
            indexOperator = str.indexOf(opArray[i]);
            if (indexOperator != -1) {
                return indexOperator;
            }
        }
        return indexOperator;
    }

}
