#include<iostream>
using namespace std;

class Arithematic{
  private:
    int a,b;
  public:
    Arithematic();
    Arithematic(int x,int y);
    int add();
    int sub();
    int geta();
    int getb();
    void seta(int x);
    void setb(int y);
    void usrseta();
    void usrsetb();
    ~Arithematic();
};


Arithematic::Arithematic(){
  a=0;
  b=0;
}
// if using different parameter names (doesn't look cool)
// Arithematic::Arithematic(int x, int y){
//   a = x;
//   b = y;
// }

Arithematic::Arithematic(int a, int b){
  this->a = a;
  this->b = b;
}

Arithematic::~Arithematic(){cout<<"Destructor Called";}

int Arithematic::add() {
  return a+b;
}

int Arithematic::sub() {
  return a-b;
}

void Arithematic::seta(int x){
  a=x;
}

void Arithematic::setb(int y){
  b=y;
}
void Arithematic::usrseta(){
  cout<<"Enter a : ";
  cin>>a;
}

void Arithematic::usrsetb(){
  cout<<"Enter b : ";
  cin>>b;
}

int Arithematic::geta(){
  return a;
}

int Arithematic::getb(){
  return b;
}

int main(){
  Arithematic nums;
  
  cout<<"a is "<<nums.geta()<<", ";
  cout<<"b is "<<nums.getb()<<endl;

  cout<<"Sum is "<<nums.add()<<endl;
  cout<<"a-b is "<<nums.sub()<<endl;
  cout<<"***********************************\n";
  
  Arithematic nums1{15,8};
  
  cout<<"a is "<<nums1.geta()<<", ";
  cout<<"b is "<<nums1.getb()<<endl;

  cout<<"Sum is "<<nums1.add()<<endl;
  cout<<"a-b is "<<nums1.sub()<<endl;
  cout<<"***********************************\n";
  
  Arithematic nums2;
  nums2.seta(52);
  nums2.setb(34);

  cout<<"a is "<<nums2.geta()<<", ";
  cout<<"b is "<<nums2.getb()<<endl;

  cout<<"Sum is "<<nums2.add()<<endl;
  cout<<"a-b is "<<nums2.sub()<<endl;
  cout<<"***********************************\n";
  
  Arithematic nums3;
  nums3.usrseta();
  nums3.usrsetb();

  cout<<"a is "<<nums3.geta()<<", ";
  cout<<"b is "<<nums3.getb()<<endl;

  cout<<"Sum is "<<nums3.add()<<endl;
  cout<<"a-b is "<<nums3.sub()<<endl;

}