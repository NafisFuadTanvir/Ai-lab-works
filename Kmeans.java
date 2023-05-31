public class KMEANS {

    public static void main(String[] args) {
        int dataset[]={2,4,10,12,3,20,30,11,25};
        int i,m1,m2,a,b,n=0;
        boolean flag;
        float sum1,sum2;

        a= dataset[0];
        b=dataset[6];

        m1=a;
        m2=b;
        int cluster1[]= new int[dataset.length];
        int cluster2[]= new int[dataset.length];

        do{

            sum1=0;
            sum2=0;
            cluster1= new int[dataset.length];
            cluster2= new int[dataset.length];
            n++;
            int k=0,j=0;
            for(i=0;i< dataset.length;i++){

                if(Math.abs(dataset[i]-m1)<= Math.abs(dataset[i])-m2){
                    cluster1[k]=dataset[i];
                    k++;
                }
                else{
                    cluster2[j]=dataset[i];
                    j++;
                }
            }

            System.out.println();

            for(i=0;i<k;i++){
                sum1= sum1+cluster1[i];
            }

            for(i=0;i<j;i++){
                sum2=sum2+cluster2[i];
            }

            System.out.println("M1="+m1+"M2="+m2);

            a=m1;
            b=m2;
            m1=Math.round(sum1/k);
            m2=Math.round(sum2/j);
            flag=!(m1==a && m2==b);
            System.out.print("after itration"+n+",cluster 1:- ");

            for(i=0;i<cluster1.length;i++){

                System.out.print(cluster1[i]+ "\t");

            }

            System.out.println();

            System.out.print("after itration"+n+",cluster 2:- ");

            for(i=0;i<cluster2.length;i++){

                System.out.print(cluster2[i]+ "\t");

            }

            System.out.println();

        }while (flag);

        System.out.println("final cluster1:- \n");

        for(i=0;i<cluster1.length;i++){
            System.out.print(cluster1[i]+ "\t");
        }

        System.out.println();

        System.out.print("final cluster2:- \n");

        for(i=0;i<cluster2.length;i++){
            System.out.print(cluster2[i]+ "\t");
        }


    }

}
