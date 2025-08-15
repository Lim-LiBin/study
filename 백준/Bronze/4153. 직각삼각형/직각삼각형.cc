#include <bits/stdc++.h>
#define fastIO cin.tie(0)->sync_with_stdio(0)
using namespace std;

int main() {
    fastIO;
    
    int a, b, c;
    
    while (true) {
        cin >> a >> b >> c;
        if (a == 0 && b == 0 && c == 0) break;
        
        int x = max({a, b, c});
        int y, z;
        if (x == a) { y = b; z = c;}
        else if (x == b) {y = a; z = c;}
        else {y = a; z = b;}
        
        if (y*y + z*z == x*x) 
            cout << "right\n";
        else
            cout << "wrong\n";
    }
}