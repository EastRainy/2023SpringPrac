<h1>Problems</h1>

---
<h3>프로젝트 진행 중 발생했던 문제들</h3>
<ol>1. 인증서 관련 문제</ol>

===
> <h5>1. 인증서 관련 문제</h5>
> 프로젝트 생성시 발생했던 문제로 한 환경(집)에서는 문제 없이 작동되었는데 동일한 코드로
> 
> 작동시 다른 환경에서는 정상적으로 실행되지 않았던 문제.
> 
> 문제된 곳의 java환경에서의 인정서 문제로 인증서가 등록되지 않아 외부참조를 하지 못하여 빌드 실패가 일어남
> 
> 해당 환경의 java에 keytool을 이용하여 인터넷 브라우저를 통해 구한 인증서를 등록하여 사용하여 문제 해결