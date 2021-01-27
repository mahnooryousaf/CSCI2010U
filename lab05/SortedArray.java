public class SortedArray {

    public int assignmentCount = 0;

    private Warrior warrior;
    private int currentIndex = 0;
    Warrior[] sortedWarriors = new Warrior[100];


    // inserts a warrior into the array then sorts the array using bubble sort

    public void insert(Warrior warrior) {
        sortedWarriors[currentIndex] = warrior;
        assignmentCount += 1;
        currentIndex ++;

        //Bubble Sort Array
        for(int i = currentIndex-1; i >= 0; i--){
            assignmentCount += 2;
            for(int j = 1; j <= i;j++){
                assignmentCount += 2;
                if(sortedWarriors[j-1].getSpeed() <= sortedWarriors[j].getSpeed()){
                    Warrior temp = sortedWarriors[j-1];
                    sortedWarriors[j-1] = sortedWarriors[j];
                    sortedWarriors[j] = temp;
                    assignmentCount += 4;
                }
            }
        }
    }

}