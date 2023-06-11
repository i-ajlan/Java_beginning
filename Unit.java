abstract class Unit{
    public int hp; 
    public int score;
    int x, y;
    Field field;

    Unit(Field field, int x, int y){
        this.field = field;
        this.x = x;
        this.y = y;
        hp = 3;
        score = 0;
    }
    // int getHp(){
    //     return hp;
    // }
    // int getScore(){
    //     return score;
    // }
    abstract void move(char key);
}