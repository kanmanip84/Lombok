public class listOfTrain {
    public static void main(String[] args) {
        System.out.println("Availability of Trains:");
        System.out.println("-----------------------");
        SearchTrain list1= new SearchTrain("Chennai Express", "12345", "Bangalore", "Chennai",  "sleeper class", "General");
        SearchTrain list2= new SearchTrain("Royal   Express", "6789 ", "Bangalore", "Chennai",  "sleeper class", "General");

        SearchTrain[] myTrain = new SearchTrain[2];
        myTrain[0]=list1;
        myTrain[1]=list2;

        for (int i = 0; i < myTrain.length; i++) {

            System.out.println(myTrain[i].getTrainNumber()+"  "+myTrain[i].getTrainName()+"  "+ myTrain[i].getFrom()+"  "+myTrain[i].getTo()+"  "+myTrain[i].getTravelClass()+"  "+myTrain[i].getQuota());
        }
    }
















}
