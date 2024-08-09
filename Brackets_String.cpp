#include <bits/stdc++.h>


using namespace std;

int main() {
    string str;
    cin >> str;
    
    int n = str.length();

   

    if(n%2 != 0) {
        cout << "Unbalanced";
        return 0;
    }

    int count = 0;
    for(int i = 0; i < n; i++) {
        if(str[i] =='(') {
            count++;
        }
        if(str[i] == ')') {
            count--;
        }

        if(count < 0) {
            cout << "Unbalanced" << endl;
            return 0;
        }
    }
    if(count == 0) {
        cout << "Balanced" << endl;
    } else {
        cout << "Unbalanced" << endl;
    }

    return 0;
}