class Jumper extends Unit{
    Jumper(Field field, int x, int y){
        super(field, x, y);
    }

    @Override
    
    void move(char key){
        int nx = x; 
        int ny = y;

        switch(key){
            case 'w': ny-=2; break;
            case 'a': nx-=2; break;
            case 's': ny+=2; break;
            case 'd': nx+=2; break;
            default: System.out.println("...");
            return;
            
        }

        if(!field.canGo(nx,ny)){
            System.out.println("Can't go...");
            return;
        }

        
        //Extra checking at home

        x=nx;
        y=ny;

        if(field.gainPoints(nx,ny)){
            score++;
        }
        if(field.loseHp(nx,ny)){
            hp--;
        }
    }

}