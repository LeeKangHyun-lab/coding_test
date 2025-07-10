#include <iostream>
using namespace std;

int main()
{
	int a, b;
	double sum = 0.0;
	cin >> a;
	cin >> b;
	cout<<fixed;
	cout.precision(9);
	sum = (double)a / b;
	cout << sum;
}
