package arrays;

public class ArrayQuestions {
    public static int compress(String a[]){
        int index = 0;
        int i = 0;
        for (int j=0;j<a.length;j++){
             if((a[j]!=a[i])|| (j==(a.length-1))){
                 a[index]=a[i];
                 index++;
                 if (j-i >1){
                    String count= j-i+"";
                    char[] lengthArray = count.toCharArray();
                    for (int k=0; k< lengthArray.length;k++){
                        a[index]= lengthArray[k]+"";
                        index++;
                    }
                 }
                 i=j;
             }

        }

return index;
    }
}
