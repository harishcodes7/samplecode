class ca {
    public void PlayMusic(){
        System.out.println("Playing Music");
    }
    public String GetmeaPen(int cost){
        if(cost>=10)
            return "pen";
        return "nothing";
    }
}
public class methodoverloading{
    public static void main(String[] args) {
        twomethods obj = new twomethods();
        obj.PlayMusic();
        String str= obj.GetmeaPen(7);
        System.out.println(str);
    }

}

