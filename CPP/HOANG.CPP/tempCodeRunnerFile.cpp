#include <iostream>
using namespace std;
int main ()
{ 
    while ( true )
    system( "cls")
    cout << " \n\n\t\t============MENU=============";
    cout << "\n1.liet ke tat ca cac uoc so nguyen?";
    cout << " \n2. Doi voi?";
    cout << "\n3. Kiem tra so nguyen duong n co phai so doi xung hay khong?";
    cout << "\0. ket thuc";
    cout << "\n\t ++++++++END++++++++"
    int luachon;
    cout << "nhap lua chon cua ban:\t"
    cin >> lua chon;
    if(luachon == 0)
    {break};
    else if (luachon ==1 )
    { cout << "thuc hien cau 1";}
    else if (luachon ==2)
    { cout << "thuc hien cau 2";}
    else if (luachon ==3 )
    {cout << "thuc hien cau 3";}
    system ("pause");
    return 0;
}