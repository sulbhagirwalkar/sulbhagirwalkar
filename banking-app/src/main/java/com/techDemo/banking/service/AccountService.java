package com.techDemo.banking.service;

import com.techDemo.banking.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);
}
