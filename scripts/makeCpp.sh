#!/bin/bash

echo "Please enter the name of the Cpp file"
read name

name="$name.cpp"

if [ -f "$name" ]; then 
    echo "File already exists!"
else
    cat <<EOL > "$name"
#include<bits/stdc++.h>

using namespace std;

#define ll long long int 
#define nline "\n"

void solve(){

}

int main(){

    freopen("./outputs/input.txt", "r", stdin); 
  
    freopen("./outputs/output.txt", "w", stdout); 

    ios_base::sync_with_stdio(0);
    cin.tie(0);cout.tie(0);

    // int t; cin>>t;while(t--)
    // solve();
    
    return 0;
}
EOL
fi

code ./"$name"