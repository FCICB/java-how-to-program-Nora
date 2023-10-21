#include <iostream>
#include <string>

using namespace std;

int main()
{
    string s;
    int length;
    cout << "enter string :" << endl;
    getline(cin,s);//including space
    length=s.length();
    cout << "The length of the string is " <<length<<endl;
    cout << "The string with a field width twice its length is: ";
    cout.width(length*2);
    cout<<s<<endl;

    return 0;
}
