package br.com.MardevIDproject.br.com.marlon.bild.BildID;


public class Bild {

    public String idNameBild(){
        IDelemnt newIDBild = new IDelemnt();

        String idNameBild1 = "";
        String idchar1 = idNameBild1 + newIDBild.BildIDElement1();

        String idchar2 = idNameBild1 + newIDBild.BildIDElement2();

        String idchar3 = idNameBild1 + newIDBild.BildIDElement3();

        String idchar4 = idNameBild1 + newIDBild.BildIDElement4();

        String idchar5 = idNameBild1 + newIDBild.BildIDElement5();

        String idchar6 = idNameBild1 + newIDBild.BildIDElement6();

        String idchar7 = idNameBild1 + newIDBild.BildIDElement7();

        String idchar8 = idNameBild1 + newIDBild.BildIDElement8();

        String idchar9 = idNameBild1 + newIDBild.BildIDElement9();

        String idchar10 = idNameBild1 + newIDBild.BildIDElement10();

        String idchar11 = idNameBild1 + newIDBild.BildIDElement11();

        return idchar1 + idchar2 + idchar3 + idchar4 + idchar5 + idchar6 + idchar7 + idchar8 + idchar9 + idchar10 + idchar11;
    }


}

class IDelemnt{

    char BildIDElement1(){
        char IDElement1 = '0';

        return IDElement1;
    }

    char BildIDElement2(){
        char IDElement2 = '0';
        return IDElement2;
    }

    char BildIDElement3(){
        char IDElement3 = '0';
        return IDElement3;
    }

    char BildIDElement4(){
        char IDElement4 = '0';
        return IDElement4;
    }

    char BildIDElement5(){
        char IDElement5 = '0';
        return IDElement5;
    }

    char BildIDElement6(){
        char IDElement6 = '0';
        return IDElement6;
    }

    char BildIDElement7(){
        return '-';
    }

    char BildIDElement8(){
        char IDElement8 = '0';
        return IDElement8;
    }

    char BildIDElement9(){
        char IDElement9 = '0';
        return IDElement9;
    }

    char BildIDElement10(){
        char IDElement10 = '0';
        return IDElement10;
    }

    char BildIDElement11(){
        char IDElement11 = '0';
        return IDElement11;
    }

}


