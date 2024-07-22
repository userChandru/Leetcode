int minMovesToSeat(int* seats, int seatsSize, int* students, int studentsSize) {
    int count=0;
    for(int i=0; i<seatsSize;i++)
        for(int j=i+1; j<seatsSize; j++){
            if(seats[i]>seats[j]){
                int temp = seats[i];
                seats[i] = seats[j];
                seats[j]=temp;
            }
            if(students[i]>students[j]){
                int temp = students[i];
                students[i] = students[j];
                students[j]=temp;
            }
        }
    for(int i=0; i<seatsSize; i++)
        count+=abs(students[i]-seats[i]);
    return count;
}