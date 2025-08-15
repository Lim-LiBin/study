#include <bits/stdc++.h>
#define fastIO cin.tie(0)->sync_with_stdio(0)
using namespace std;

int main() {
    fastIO;
    
    int n, s, m , l, xl, xxl, xxxl, t, p;
    
    cin >> n;
    cin >> s >> m >> l >> xl >> xxl >> xxxl;
    cin >> t >> p;
    
    int t1 = 0;
    t1 += (s    + t - 1) / t;
    t1 += (m    + t - 1) / t;
    t1 += (l    + t - 1) / t;
    t1 += (xl   + t - 1) / t;
    t1 += (xxl  + t - 1) / t;
    t1 += (xxxl + t - 1) / t;
    
    int p1 = n / p;
    int p2 = n % p;
    
    cout << t1 << '\n';
    cout << p1 << " " << p2;
}