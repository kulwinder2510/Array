public class StringSession {

    public static void main(String[] args) {

//           String s ="hello";
//
////           System.out.println(s.toUpperCase());
//
//            System.out.println(s.toLowerCase());
//        }
//    }

        ////////     concatenate

//        String s1 = "hello ";
//        String s2 = "world";
//        String s3 = s1.concat(s2);
//        System.out.println(s3);
//    }
//}

        ////      OR

//        String s1 = "hello ";
//        String s2 = "world";
//
//        System.out.println(s1+s2);
//    }
//}

        ////         substring

//        String s1 = "hello world";
//
//        String s2 = s1.substring(2,5);
//
//        System.out.println(s2);
//    }
//}


//        String s1 = "hello world";
//
//        String s2 = s1.substring(7,8);
//
//        System.out.println(s2);
//    }
//}


//    String s1 = "hello world";
//
//        System.out.println(s1.length());
//
//        // END POSITION CAN'T COUNTED

//        String s2 = s1.substring(7,8);
//
//        System.out.println(s2);
//    }
//}


//        String s1 = "hello world";
//
//        int firstPosition = s1.indexOf('h');
//        int lastPosition = s1.indexOf('w');
//
//        String s2 = s1.substring(firstPosition, lastPosition);
//
//        System.out.println(s2);
//    }
//}


//        String s1 = "hello world";
//
//        int firstPosition = s1.indexOf('h');
//        int lastPosition = s1.indexOf('w');
//
//        String s2 = s1.substring(firstPosition, lastPosition+1);
//
//        System.out.println(s2);
//    }
//}


        /////////////// OR

//        String s1 = "hello world";
//
//        String s2 = s1.substring(0,11);
//
//        System.out.println(s2);
//    }
//}


//        String s1 = "hello world";
//
//        int firstPosition = s1.indexOf('l');
//        int lastPosition = s1.indexOf('r');
//
//        String s2 = s1.substring(firstPosition, lastPosition+1);
//
//        System.out.println(s2);
//    }
//}


        //////////// OR


//        String s1 = "hello world";
//
//        String s2 = s1.substring(2,9);
//
//        System.out.println(s2);
//    }
//}


        /////////////// SPLITTED STRING


//        String s1 = "hello world , i am in java session.";
//
//        String[] splitedString = s1.split(" ");
//        for (int i = 0; i < splitedString.length; i++) {
//            System.out.println(splitedString[i]);
//        }
//    }
//    }


/////////////// IN SPLITTED SESSION, IF WE WANT TO REMOVE 'o' FROM STRING S1 THEN,


//    String s1 = "hello world , i am in java session.";
//
//    String[] splitedString = s1.split("o");
//        for (int i = 0; i < splitedString.length; i++) {
//        System.out.println(splitedString[i]);
//        }
//        }
//        }


        ////////////////// IF I WANT TO SELECT ANY ONE WORD THROUGH SPLITTED STRING THEN,


//        String s1 = "hello world , i am in java session.";
//
//        String[] splitedString = s1.split(" ");
//
//        String s6 = splitedString[4];
//
//        System.out.println(s6);
//    }
//    }


        //////////////////////////////////// INTERVIEW QUESTIION
        ///////////////////// HOW TO FIND TOTAL LENGTH OF WORDS FROM PAPGRAGH


//        String s1 = "Lorem Ipsum is simply dummy text the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
//
//        String[] word = s1.split("");
//        String Maxword = "";
//        for (int i = 0; i < word.length; i++) ;
//        System.out.println(word.length);
//    }
//}


        ////////////very imp //////   interview  ////////// FIND THE LARGEST WORD

//        String s1 = "hello world, i am  learning java from loreum-ipsum.";
//        String[] words = s1.split(" ");
//        String longestWord = words[0];
//
//        for(int i = 0; i < words.length; i++) {
//            if (words[i].length() > longestWord.length()) {
//                longestWord = words[i];
//            }
//        }
//        System.out.println("Longest word: " +longestWord);
//    }
//}


        ///////   ????  smallest word//////////////////////////

//        String s1 = "learningjava hello world, i am  learning1 java from learning2";
//        String[] words = s1.split(" ");
//        String smallestWord = words[0];
//
//        for(int i = 0; i < words.length; i++) {
//            if (words[i].length() > smallestWord.length()) {
//                smallestWord = words[i];
//            }
//        }
//        System.out.println("Smallest word : " +smallestWord);
//    }
//  }


        ///////////// SAME OR DIFFERENT ///////////

//    String s1 = "emaan";
//    String s2 = "emaan singh";
//
//    if(s1 == s2){
//        System.out.println("s1 and s2 are same");
//    }
//        else {
//            System.out.println("s1 and s2 are different");
//        }
//
//        int a = 5;
//        int b =5;
//        if(a == b){
//            System.out.println("a and b are same");
//        }
//        else {
//            System.out.println("a and b are different");
//        }
//    }
//    }


        /////compairing with other classes like class a nd b//////

//        ClassA A1 = new ClassA();
//        ClassB B1 = new ClassB();
//
//        if (A1.s == B1.s) {
//            System.out.println("s1 and s2 are same");
//        } else {
//            System.out.println("s1 and s2 are not same");
//
//            if (A1.a == B1.a) {
//                System.out.println("a and b are same");
//            } else {
//                System.out.println("a and b are not same");
//            }
//        }
//    }
//}


//        ClassA A1 = new ClassA();
//        ClassB B1 = new ClassB();
//
//        if (A1.s.matches("\\d\\D")) {
//            System.out.println("s1 satisfy  rules of regex");
//        } else {
//            System.out.println("s1 doesn't satisfy  rules of regex");
//        }
//
//    }
//}


       ClassA objA = new ClassA("abc","xyz","pqr",5);
       ClassA objB = new ClassA("dss","djf","end",10);

       if(objA.equals(objB)){
       System.out.println("objA and objB are same");
       }else{
           System.out.println("objA and objB are not same");
       }
       }
    }