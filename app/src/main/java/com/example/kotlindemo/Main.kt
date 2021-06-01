package com.example.kotlindemo

fun main() {
    a@ for(i in 1..5){
      b@ for(j in 1..4){
          if(i==3 || j==2){
              continue@a
          }
          println("i= $i;j = $j")
      }
    }
}
//https://telescope.adobeconnect.com/_a1110142776/ptfabfvtb0q9/?session=apac1breez4txfuept5fakqvnr 10/05
//https://telescope.adobeconnect.com/_a1110142776/p4htkfvp2bsr/?session=apac1breez9i9b72czubbhqvd6 11/05
//https://telescope.adobeconnect.com/_a1110142776/pwmqgea326in/?session=apac1breezbreueztdgbicxpcu 12/05