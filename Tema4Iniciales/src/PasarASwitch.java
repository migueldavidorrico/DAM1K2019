public class PasarASwitch {
    public static void main(String[] args) {
        int x=9;
        char opcion='d';
        switch(opcion){
            case 'u':x=x+1;
            break;
            case 'd':x=x+2;
            break;
            case 't':x=x+3;
            break;
            default:x=x+4;
            break;
        }
        //NO LO HACEMOS
        switch(opcion){
            case 'u':x++;
            case 'd':x++;
            case 't':x++;
            default:x++;
                break;
        }
//        if (opcion==’u’)
//        x=x+1;
//else
//        if (opcion==’d’)
//        x=x+2;
//else
//        if (opcion==’t’)
//        x=x+3;
//else
//        x=x+4;
    }
}
