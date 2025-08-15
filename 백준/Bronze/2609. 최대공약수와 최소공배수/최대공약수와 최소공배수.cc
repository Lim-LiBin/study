#include <bits/stdc++.h>
#define fastIO cin.tie(0)->sync_with_stdio(0)
using namespace std;

int gcd(int num1, int num2) {
    if (num2 == 0) return num1;
    return gcd(num2, num1 % num2);
}
    
int lcm(int num1, int num2) {
    return num1 * num2 / gcd(num1, num2);
}
    
    
int main() {
    fastIO;
    
    int a, b;
    
    cin >> a >> b;
    
    int c = gcd(a, b);
    int d = lcm(a, b);
    
    cout << c << '\n' << d;
    
    return 0;
}