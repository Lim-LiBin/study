#include <iostream>

using namespace std;

int main() {
    int h, m;
    
    cin >> h >> m;
    
    if (h > 0) {
        if (m >= 45) {
            cout << h << " " << m-45;
        } else if (m < 45) {
            h -= 1;
            cout << h << " " << 60-(45-m);
        }
    } else if (h == 0) {
        if (m >= 45) {
            cout << h << " " << m-45;
        } else if (m < 45) {
            h = 23;
            cout << h << " " << 60-(45-m);
        }
    }
    
    return 0;
}