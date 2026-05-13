public class Main {
    public static void main(String[] args) {
        String periodo;

        for(int i=0;i<24;i++){
            for(int j=0;j<60;j++) {
                for(int k=0;k<60;k++){
                    if(i<12){
                        periodo = "AM";
                    } else {
                        periodo = "PM";
                    }
                    if (i < 10) {
                        System.out.printf("0%d:", i);
                    } else {
                        System.out.printf("%d:", i);
                    }

                    if (j < 10) {
                        System.out.printf("0%d:", j);
                    } else {
                        System.out.printf("%d:", j);
                    }

                    if (k < 10) {
                        System.out.printf("0%d %s\n", k, periodo);
                    } else {
                        System.out.printf("%d %s\n", k, periodo);
                    }

                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}