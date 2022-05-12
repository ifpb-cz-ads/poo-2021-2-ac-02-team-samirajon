class BMExercicio04 {
    public static void main(String[] args){
        long long1 = 100;
        int int1 = 200;
        //int int2 = int1 + long1; --> da erro quando vai somar o valor long com o int
        //pois precisa do casting
        int int2 = int1 + (int)long1; //convertendo tipo long para int
        
        System.out.println(int2);
    }
}
