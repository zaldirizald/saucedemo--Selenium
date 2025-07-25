Feature: Login
  Sebagai Pengguna Saya ingin Login akun
@login
  Scenario: Sebagai Pengguna Saya ingin Login akun
    Given Pengguna berada di landingpage
    When Pengguna Input Username valid
    And Pengguna Input Password valid
    And Pengguna klik button Login
    Then Pengguna berhasil login

  Scenario: Sebagai Pengguna Saya ingin Login invalid akun
    Given Pengguna berada di landingPage
    When Pengguna Input Username invalid
    And Pengguna Input password valid
    And Pengguna klik button login
    Then Pengguna tidak berhasil login