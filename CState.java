public enum CState {
    Empty,Hit,Miss;
    private CState(){}

    public String toString(){
        if(this==Empty){
            return ".";
        }
        else if(this==Hit){
            return "X";

        }
        else if(this==Miss){
            return"o";

        }
        else return "?";
    }
}
