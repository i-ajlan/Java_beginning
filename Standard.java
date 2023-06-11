class Standard extends Unit{
   
    Standard (Field field, int x, int y){
        super(field, x, y);
    }

    @Override
    void move(char key){
        int nx = x; 
        int ny = y;

        switch(key){
            case 'w': ny--; break;
            case 'a': nx--; break;
            case 's': ny++; break;
            case 'd': nx++; break;
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