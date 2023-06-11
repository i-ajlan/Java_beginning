class Ghost extends Unit{
    Ghost(Field field, int x, int y){
        super(field, x, y);
    }

    @Override
    
    void move(char key){
        int nx = x; 
        int ny = y;
        do{
        switch(key){
            case 'w': ny--; break;
            case 'a': nx--; break;
            case 's': ny++; break;
            case 'd': nx++; break;
            default: System.out.println("...");
            return;
            
        }
        }while(field.isObstacle(nx, ny));
        
        if(!field.canGo(nx,ny)){
            System.out.println("Can't go...");
            return;
        }
        
        
        //Extra checking at home
        //field.matrix[y][x]='_';
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