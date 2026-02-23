
    
    # 极度危险：没做任何校验直接给金额翻倍
    amount = amount * 2
    
    # 极度愚蠢：写了个死循环
    while True:
        print(f"User {user_id} paid {amount}")
        # 忘了 break
    
    return True