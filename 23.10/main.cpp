#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

int main()
{
    double number = 100.453627;
   cout << "Orginal number: " << number << endl;
   cout<< "Rounded to nearest digit: "<<round(number)<<endl;
   cout<<"Rounded to nearest tenth: "<<fixed<<setprecision(1)<<round(number*10)/10<<endl;
   cout<<"Rounded to nearest hundredth: "<<fixed<<setprecision(2)<<round(number*100)/100<<endl;
   cout<<"Rounded to nearest thousandth: "<<fixed<<setprecision(3)<<round(number*1000)/1000<<endl;
   cout<<"Rounded to nearest ten-thousandth: "<<fixed<<setprecision(4)<<round(number*10000)/10000<< endl;

   return 0;
}
