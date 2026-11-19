# Persona 3 - Dark Hour (카카오톡 안드로이드 테마 프로젝트)

페르소나 3(Persona 3 / Reload) 특유의 코발트·시안 블루(`#00B4FF`), 미드나잇 네이비(`#070D1A`), 섀도 타임(Dark Hour) 에메랄드 포인트(`#39E58C`), 그리고 만월·자정 시계·초승달·아르카나 다이아 심볼만으로 구성한 캐릭터 없는 깔끔한 안드로이드 카카오톡 테마 프로젝트입니다.

## APK 빌드 및 적용 방법 (2가지 중 선택)

### 방법 1: Android Studio에서 바로 APK 생성
1. 압축 해제 후 **Android Studio**에서 `Persona3_KakaoTalk_Theme_Android` 폴더를 엽니다.
2. Gradle 동기화 완료 후 상단 메뉴 **`Build` → `Build Bundle(s) / APK(s)` → `Build APK(s)`**를 클릭합니다.
3. 생성된 `app/build/outputs/apk/debug/app-debug.apk` 파일을 스마트폰으로 옮겨 설치합니다.
4. 카카오톡 실행 → **더보기 탭 → 설정 → 테마 → `Persona 3 - Dark Hour`** 선택 후 **적용하기**를 누릅니다.

### 방법 2: Android Studio 없이 GitHub Actions로 자동 APK 빌드
1. GitHub에 새 저장소(Repository)를 만들고 압축 해제한 폴더 내용을 그대로 업로드합니다 (`.github/workflows/build-apk.yml` 포함).
2. 저장소의 **Actions** 탭에서 빌드가 완료되면 **`Persona3-KakaoTalk-Theme-APK`**를 다운로드합니다.
3. `.apk` 파일을 스마트폰에 설치한 뒤 카카오톡 테마 설정에서 적용합니다.

### 참고: 최신 카카오 공식 샘플 테마에 리소스만 덮어쓰기
최신 카카오톡 샘플 테마 프로젝트에 `app/src/main/theme/` 폴더(`values/colors.xml` 및 `drawable-*`)만 덮어씌워 빌드해도 동일하게 적용할 수 있습니다.
