package br.com.marlon.Services;

import br.com.marlon.Services.ElementsLogic.randomElements;

import java.util.Random;

public class Bild {

    public static String[] idNameBild(String n1,String n10){

        IDelemnt newIDBild = new IDelemnt();


        String idNameBild1 = "";

        String idchar1 = idNameBild1 + newIDBild.BildIDElement1(n1);

        String idchar2 = idNameBild1 + newIDBild.BildIDElement2();

        String idchar3 = idNameBild1 + newIDBild.BildIDElement3();

        String idchar4 = idNameBild1 + newIDBild.BildIDElement4();

        String idchar5 = idNameBild1 + newIDBild.BildIDElement5();

        String idchar6 = idNameBild1 + newIDBild.BildIDElement6();

        String idchar7 = idNameBild1 + newIDBild.BildIDElement7();

        String idchar8 = idNameBild1 + newIDBild.BildIDElement8();

        String idchar9 = idNameBild1 + newIDBild.BildIDElement9();

        String idchar10 = idNameBild1 + newIDBild.BildIDElement10();

        String idchar11 = idNameBild1 + newIDBild.BildIDElement11(n10);

        String idchar12 = idNameBild1 + newIDBild.BildIDElement12();

        String idchar13 = idNameBild1 + newIDBild.BildIDElement13();

        String idchar14 = idNameBild1 + newIDBild.BildIDElement14();

        String idchar15 = idNameBild1 + newIDBild.BildIDElement15();

        String idchar16 = idNameBild1 + newIDBild.BildIDElement16();

        String idchar17 = idNameBild1 + newIDBild.BildIDElement17();

        String idchar18 = idNameBild1 + newIDBild.BildIDElement18();

        String idchar19 = idNameBild1 + newIDBild.BildIDElement19();

        String idchar20 = idNameBild1 + newIDBild.BildIDElement20();

        String idchar21 = idNameBild1 + newIDBild.BildIDElement21();

        String idchar22 = idNameBild1 + newIDBild.BildIDElement22();

        String idchar23 = idNameBild1 + newIDBild.BildIDElement23();

        String idchar24 = idNameBild1 + newIDBild.BildIDElement24();

        String[] idcomplete = new String[24];
        idcomplete[0] = idchar1;
        idcomplete[1] = idchar2;
        idcomplete[2] = idchar3;
        idcomplete[3] = idchar4;
        idcomplete[4] = idchar5;
        idcomplete[5] = idchar6;
        idcomplete[6] = idchar7;
        idcomplete[7] = idchar8;
        idcomplete[8] = idchar9;
        idcomplete[9] = idchar10;
        idcomplete[10] = idchar11;
        idcomplete[11] = idchar12;
        idcomplete[12] = idchar13;
        idcomplete[13] = idchar14;
        idcomplete[14] = idchar15;
        idcomplete[15] = idchar16;
        idcomplete[16] = idchar17;
        idcomplete[17] = idchar18;
        idcomplete[18] = idchar19;
        idcomplete[19] = idchar20;
        idcomplete[20] = idchar21;
        idcomplete[21] = idchar22;
        idcomplete[22] = idchar23;
        idcomplete[23] = idchar24;


        return idcomplete;


    }


}


class IDelemnt{

    char BildIDElement1(String IDElement1){


        String allowedCharacters = "";

        char idchar1 = IDElement1.charAt( 0 ) ;

        switch (idchar1) {
            case 'A':
                allowedCharacters = "8574359rufda";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'B':
                allowedCharacters = "8759521laker";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'C':
                allowedCharacters = "75200523trwtrw";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'D':
                allowedCharacters = "nfshj721242";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'E':
                allowedCharacters = "word3241fds";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'F':
                allowedCharacters = "32426bbfsd224";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'G':
                allowedCharacters = "mfsy727842kv";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'H':
                allowedCharacters = "08328hjnksdçpuq";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'I':
                allowedCharacters = "nbgfggywtwqwzxcv5890923";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'J':
                allowedCharacters = "ad3554019ofs";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'K':
                allowedCharacters = "nfhjsui24327561";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'L':
                allowedCharacters = "8574359rufda";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'M':
                allowedCharacters = "005432919jkfsa";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'N':
                allowedCharacters = "bvvnbxczbmbn8671244322006";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'O':
                allowedCharacters = "88783jfdvburwkiy";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'P':
                allowedCharacters = "mlkavggf36428600653";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'Q':
                allowedCharacters = "mnjf762avfrsvmybvd";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'R':
                allowedCharacters = "hkj543sdg";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'S':
                allowedCharacters = "74280efsd";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'T':
                allowedCharacters = "knfsk2432";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'U':
                allowedCharacters = "inbv82145";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'V':
                allowedCharacters = "813879qfv";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'W':
                allowedCharacters = "8574359rufda";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'X':
                allowedCharacters = "nna224145fdsf";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'Y':
                allowedCharacters = "091345hkqr";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;
            case 'Z':
                allowedCharacters = "23432807adhvf642";
                idchar1 = randomElements.elementRandom(allowedCharacters);
                break;

        }

        return idchar1;
    }

    char BildIDElement2(){
        return '0';
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
        return '-';
    }

    char BildIDElement6(){
        char IDElement6 = '0';
        return IDElement6;
    }

    char BildIDElement7(){
        return '0';
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
        return '-';
    }

    char BildIDElement11(String IDElement10){
        return IDElement10.charAt(0);
    }

    char BildIDElement12(){
        return '0';
    }

    char BildIDElement13(){
        return '0';
    }
    char BildIDElement14(){
        return '0';
    }
    char BildIDElement15(){
        return '-';
    }

    char BildIDElement16(){
        return '0';
    }

    char BildIDElement17(){
        return '0';
    }

    char BildIDElement18(){
        return '0';
    }
    char BildIDElement19(){
        return '0';
    }
    char BildIDElement20(){
        return '-';
    }

    char BildIDElement21(){
        return '0';
    }
    char BildIDElement22(){
        return '0';
    }
    char BildIDElement23(){
        return '0';
    }
    char BildIDElement24(){
        return '0';
    }


}


