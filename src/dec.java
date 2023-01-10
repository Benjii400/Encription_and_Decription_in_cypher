public class dec {
    String encData=" ";
    String decData="";

    char[] alp={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};



    String enc(String data){

        for(int i=0; i<data.length(); i++){
            for(int j=0; j<alp.length ; j++){
                if(data.charAt(i)==' '){
                    encData = encData + " ";
                    break;
                }
                else if(data.charAt(i)==(alp[j])&&(j==25||j==24||j==23)){
                    encData = encData + alp[j-23];
                    break;
                }
                else if(data.charAt(i)==(alp[j]) && (j==49||j==50||j==51)){
                    encData=encData+alp[j-23];
                    break;
                }
                else if(data.charAt(i)==(alp[j])) {
                    encData=encData+alp[j+3] ;
                    break;
                }

            }
        }
        return encData;
    }
    String dec(String data){
        for(int i=0; i<data.length(); i++){
              for(int j=0; j<alp.length ; j++){
                       if(data.charAt(i)==' '){
                          decData+=" ";
                          break;
                            }
                       else if(data.charAt(i)==(alp[j])&&(j==0||j==1||j==2)){
                          decData+=alp[j+26-3];
                          break;
                            }
                       else if(data.charAt(i)==(alp[j])&&(j==28||j==27||j==26)){
                           decData+=alp[j+26-3];
                           break;
                             }
                       else if (data.charAt(i)==(alp[j])){
                           decData+=alp[j-3];
                           break;
                             }
                  }
             }
        return decData;
    }
}