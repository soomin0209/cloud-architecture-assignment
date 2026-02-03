# ☁️ CH 4 클라우드_아키텍처 설계 &amp; 배포 과제

### LV 0 - 요금 폭탄 방지 AWS Budget 설정
<img width="2086" height="1007" alt="Lv 0 - 요금 폭탄 방지 AWS Budget 설정" src="https://github.com/user-attachments/assets/fabab152-b6f2-4095-b579-3613d346ebef" />

### LV 1 - 네트워크 구축 및 핵심 기능 배포
- EC2의 퍼블릭 IP : `3.34.40.134`

### LV 2 - DB 분리 및 보안 연결하기
1. Actuator Info 엔드포인트 URL : 🔗http://3.34.40.134:8080/actuator/info
2. RDS 보안 그룹 스크린샷
<img width="2166" height="700" alt="LV 2 - DB 분리 및 보안 연결하기 - RDS 보안 그룹 스크린샷" src="https://github.com/user-attachments/assets/e4a6f998-b895-4e03-932b-165becb81db3" />

### LV 3 - 프로필 사진 기능 추가와 권한 관리
- 발급받은 Presigned URL : 🔗https://assignment-soomin0209-files.s3.ap-northeast-2.amazonaws.com/uploads/5a7133b0-8aac-4031-a379-ad34f3a549e6_%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-02-02%20125908.png?X-Amz-Security-Token=IQoJb3JpZ2luX2VjECoaDmFwLW5vcnRoZWFzdC0yIkYwRAIgJxQR9y5z7DxfyzTzaOY3FQ7%2Bb%2Fou0tgEwBhJxkvBpHYCIEXdGdLcduIvw4VvpwLU7IRCnnQurXi8a7M5tCJwkBRkKtIFCPP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQABoMMTQ1Mjg0OTcyOTg1IgwnFCWtuFKb9jISZcoqpgU%2FDaB6tIWDIy%2F3bc%2FmcU84l9i9R5O0wHwjGqJnoZHmx0BveCFwiMgehRTMe%2FhPZ5pkD8iy%2Fa1g06zU8tqTKVdGBpSo8%2FFpgXY7IL%2F7rGfNzgxXwiskRaD9x1ceagKSnIWsUSlA7vbq3DHF9vd7L6sV9YSkIWK0u1PdnNQscUjtPfGRRrlWlAQLOXFr4GFgyGxkjGkkXfKqZcabORTJhFy704%2FMpf3F%2BY%2Fa0UL1hPvwjuoZaJEOZZaTo0kVXfvpZowCRyCcl%2BWTgEcMARGy6d7oIhI7kbk7TsabDd3%2FkyH39WnF2rZe8S23Tsin4KG9ZVtQbLS%2F1wLA4H6t42V8VKOoNkobfkQP2hNKuLuaNCKIOfRxUoXVHKcI%2F3M%2FMqR6Leq9YwnkYHLFqndfwO2mJdzVv%2B8ZLK8k8wsDWUNmr%2B2tCbDRzAa1shNWhatPcj8EQCqOvIdiRqyoZFDnFVePs3nMzhqkUk%2BQ8kcQBNWSl46pq2E8TpxtZVgf2FA8RuYX7QE32jJg9xl%2Blc0FVDGwGlZfWQ%2FbdAn3IdCf5tx0MBN6M%2BfMeieD2XL%2FjpWobtVFruWyyUdc7q4Ggh7dbIkr%2FzYXB2U5m%2BMqVF%2Fmp1fFzzpcKTjIuKbIX0g59GKeTJOL%2BgH7llQILH0%2FzYMmTFQEbhzq%2F6Sddas3VwbYS0i0dqzRDSm7Z2h%2FJxBtrfeL7sCGk7P2ob%2FfjK9Z70xf%2FBCfKpCtlX2ccWTNnzQCtCuw25HZotrGvlUPdWEG1kW9QdPOKAZJpmK%2Bm7URn3Qs5q3ocGVAYsQDV9w%2BUlGCTQSZ2S%2BgFpYyK4L6qWXUf8LGFVyiAlgcsp3q7HRql%2BJMlR5VHypK693h%2BjSMK55%2BkoHYUcoeuTXUA%2BQeQocwdm%2BhNSTCJ5HkkRz7C8swtbCFzAY6sgHBzjPHRIyUGVEzVV8E9LXK7VuEP5q9O6fvrEhgADZCfjbf2%2BFUCWvRywAg0YHiDqDIz4nScZI5FuUW%2FcrQDdYwezJeRVgzzUnTDFMWgTAR8pwIEHmANgKB1XfAjAAGd4tnWv6iP2K6cgk5shpHIXJ4L7mZN2IoG07ogd%2FR8s6K6mQ9zQHPwCHV%2B3pG%2FZqasez%2FCNOUiOM%2BYlGqMnwwzBLeSCLZAUzhJkxxWjSpDSK6PUPm&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20260203T020759Z&X-Amz-SignedHeaders=host&X-Amz-Credential=ASIASDU5IYG47RK2P23J%2F20260203%2Fap-northeast-2%2Fs3%2Faws4_request&X-Amz-Expires=604800&X-Amz-Signature=443b3b6de7997c928119a2be1c39396cae089d549db74b42e5f47ac685a4da1c
<img width="2560" height="1528" alt="image" src="https://github.com/user-attachments/assets/1f143f39-409d-40da-93f5-717dfbba878f" />
- URL의 만료 시간 : 2026-02-10 11:07:59 (KST)

### LV 4 - Docker & CI/CD 파이프라인 구축
1. Github Actions 성공 이미지
<img width="1956" height="255" alt="Lv 4 - Docker   CI, CD 파이프라인 구축 - Github Actions 성공 이미지" src="https://github.com/user-attachments/assets/6ddd0410-8336-4d2c-8190-46d05b7916e2" />
2. EC2 터미널 이미지
<img width="2407" height="87" alt="Lv 4 - Docker   CI, CD 파이프라인 구축 - EC2 터미널 이미지" src="https://github.com/user-attachments/assets/819700eb-a08c-49e7-a11d-788fcf4e5103" />

---

<br>

## ✅ 필수 기능
<details>
  <summary>LV 0 - 요금 폭탄 방지 AWS Budget 설정</summary><br>
  
  - **설정 요구사항**
    - AWS Budgets에서 월 예산을 **$100** 로 설정하세요.
    - 예산의 80% 도달 시 이메일 알림이 오도록 설정하세요.
  - **과제 제출 요구사항**
    - 설정 완료된 AWS Budgets 화면을 캡처하여 **README.md**에 첨부하세요.

<br></details>

<details>
  <summary>LV 1 - 네트워크 구축 및 핵심 기능 배포</summary><br>
  
  - **인프라 구축 (VPC & EC2)**
    - **VPC 설계**
        - VPC을 설정하여 Public/Private Subnet 분리한다.
    - **EC2 생성**
        - Public Subnet에 EC2를 생성한다.
  - **애플리케이션 개발 (API & Actuator)**
    - **팀원 정보 저장 및 조회 API 개발**
        - `POST /api/members`
            - 팀원의 이름, 나이, MBTI를 JSON으로 받아 저장하는 API를 만드세요.
        - `GET /api/members/{id}`
            - 저장된 팀원 정보를 조회하는 API를 만드세요.
    - **운영 설정**
        - **Profile 분리**
            - 로컬에선 `H2`를 쓰고, 운영환경에선 `MySQL`을 쓰도록 `application.properties`을 `local/prod`로 분리하세요.
        - 로그 전략
            - API 요청이 들어올 때마다 `INFO` 레벨로 "[API - LOG] xx” 과 같은 로그를 남기세요.
            - 예외 처리를 구현하고, 에러 발생 시에는 `ERROR` 레벨로 스택트레이스를 남기세요.
    - **상태 모니터링 (Actuator) 추가**
        - `spring-boot-starter-actuator` 의존성을 추가하세요.
        - 설정파일에 헬스 체크 엔드포인트를 노출하세요
        
  - **배포 및 검증**
    - EC2에 프로젝트를 배포하고 실행하세요.
    - 로컬에서 `http://localhost:8080/actuator/health` 접속 시 `{"status": "UP"}`과 같은 응답을 받아야 합니다.
    
  - **과제 제출 요구사항**
    - 설정 완료된 EC2의 퍼블릭 IP 를 **README.md**에 첨부하세요.

<br></details>

<details>
  <summary>LV 2 - DB 분리 및 보안 연결하기</summary><br>
  
  - **인프라 요구사항**
    - **RDS 구축**
        - 로컬 접속용 Public Subnet 에 MySQL RDS를 만드세요. 
        (로컬 PC에서 접속 테스트가 가능해야 함)
    - **보안 그룹 체이닝**
        - RDS의 보안 그룹(Inbound)에는 IP 주소를 적지 말고, 
        **Step 1에서 만든 EC2의 보안 그룹 ID**만 허용하세요. (EC2 ↔ RDS 연결 보장)
    - **Parameter Store**
        - DB 접속 정보(`url`, `username`, `password`)와 **확인용 파라미터**를 저장.
  - **애플리케이션 요구사항**
    - Spring Boot 실행 시 Parameter Store 값을 주입받아 RDS에 연결.
    - **Actuator Info 확장**
        - Parameter Store에 저장한 `team-name` 값이 `/actuator/info` 엔드포인트에서 
        조회되도록 설정하세요.
  - **검증**
    - `http://{EC2_Public_IP}:8080/actuator/info` 접속 시, Parameter Store에
    저장한 팀 이름이 출력되어야 합니다.
  - **과제 제출 요구사항**
    1. **Actuator Info 엔드포인트 URL**
        - `/actuator/info`에 접속했을 때, Parameter Store에 저장했던 또는 확인용 파라미터 값이 JSON으로 출력되는 URL을 README.md에 작성하세요
        - *(예: `http://3.34.xx.xx:8080/actuator/info`)*
    2. **RDS 보안 그룹 스크린샷**
        - AWS 콘솔 > RDS > 보안 그룹 > **[인바운드 규칙]** 탭을 캡처하세요.
        - 소스(Source) 부분에 IP 주소(`0.0.0.0/0`)가 아닌, EC2의 보안 그룹 ID (`sg-xxxxx`)가 등록되어 있음을 보여주어야 합니다.

<br></details>

<details>
  <summary>LV 3 - 프로필 사진 기능 추가와 권한 관리</summary><br>
  
  - **인프라 요구사항**
    - **S3 버킷 생성**
        - **"모든 퍼블릭 액세스 차단"** 설정을 켜고 버킷을 생성하세요.
    - **IAM Role**
        - Access Key를 코드에 넣지 말고, S3 접근 권한이 있는 **IAM Role**을 생성해 
        EC2에 연결하세요.
  - **API 요구사항**
    - `POST /api/members/{id}/profile-image`
        - MultipartFile로 이미지를 받아 S3 버킷에 업로드하고, 이미지 URL을 DB에 업데이트하는 기능을 추가하세요
    - `GET /api/members/{id}/profile-image`
        - Presigned URL 을 생성하여 반환하세요. 클라이언트는 이 URL을 통해서만 이미지를 다운로드할 수 있어야 합니다.
        - Presigned URL의 유효기간을 꼭 7일로 설정해주세요
  - **과제 제출 요구사항**
    - 발급받은 **Presigned URL 1개**와 해당 URL의 만료 시간을 README.md에 기재하세요.

<br></details>

## ✅ 도전 기능
<details>
  <summary>LV 4 - Docker & CI/CD 파이프라인 구축</summary><br>
  
  - **Docker 도입**
    - `Dockerfile`을 작성하여 애플리케이션을 이미지로 빌드합니다.
  - **Github Actions CI/CD**
    - `.github/workflows/ci.yml`, `.github/workflows/cd.yml` 작성.
    - **CI**
        - Main 브랜치 푸시 시 Build & Test 수행.
    - **CD (Docker Hub)**
        - 빌드된 이미지를 **Docker Hub**에 Push.
        - EC2에서 `docker pull` 명령어로 이미지를 받아 실행.
  - **검증**
    - 코드를 수정하여 Github에 Push 했을 때, EC2에 자동으로 반영되는지 확인하세요.
  - **과제 제출 요구사항**
    1. **Github Actions 성공 이미지**
        - Github Repository > Actions 탭에서 배포 워크플로우가 초록색 체크(Success)로 표시된 화면을 캡처 후 README.md에 올려 주세요
    2. **EC2 터미널 이미지**
        - EC2에 접속하여 `sudo docker ps` 명령어를 입력했을 때, 실행 중인 컨테이너 목록이 나오는 화면을 캡처 후 README.md에 올려 주세요

<br></details>
