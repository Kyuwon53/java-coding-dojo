# 🔔 프로그래머스 - 커뮤러닝

## 📑 위장
### 📌 문제 설명
스파이가 가진 의상들이 담긴 2차원 배열 `clothes`가 주어질 때 서로 다른 옷의 조합의 수를 return하도록 solution 함수를 작성해라.

### ✔ 제한 사항
* clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있다. 
* 스파이가 가진 의상의 수는 1개 이상 30개 이하이다. 
* 같은 이름을 가진 의상은 존재하지 않는다. 
* clothes의 모든 원소는 문자열로 이루어져 있다. 
* 모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_'로만 이루어져 있다.
* 스파이는 하루에 최소 한 개의 의상은 입는다. 

### 💡 아이디어
- clothes 배열의 의상의 종류를 키로 해시 테이블을 만든다.
- 키에 해당하는 옷의 갯수를 카운트한다.
- 의상을 안 입을 경우, 각 하나씩 다 입어볼 경우의 수가 생기기때문에 (옷 종류 + 1) 해준 것을 카테고리 별로 곱한다.
- 마지막에 최소 한개 이상은 입어야하기때문에 아무것도 안입을 경우 1번을 빼준다.

### 💬 개선사항
 
