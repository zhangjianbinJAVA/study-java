## 线程基础 thread-base
1. ShowMainThread1 一个java程序包含的线程
2. HowStartThread2  如何创建一个线程
3. FlagCancel3     使用自定义的标志位中断线程（不安全）
4. SafeInterrupt4  安全的中断线程
5. OverrideInterrupt5 如何覆盖线程的interrupt() 方法
6. BlockInterrupt6  调用阻塞方法时，如何中断线程
7. ThreadState7  查看线程的状态
8. Daemon8  守护线程
9. RunAndStart9  Run和start方法辨析
10. SleepTest10 sleep方法是否会释放锁,不会释放锁
11. TestUser11  wait 和 notifyAll 测试
12. VolatileTest12 测试Volatile型变量的操作原子性，Volatile不能保证原子性
13. InstanceAndClass13  类锁和实例锁，使用同一个实例当为锁时，只有一个同步方法可以执行
14. BqTest14  模拟有界阻塞队列，一个线程放入数据，一个线程取出数据
15. PipeTransfer15 管道输入输出流,只适合线程间一对一的通信
16. JoinTest16 join的用法
17. ThreadLocalTest17  ThreadLocal 测试
18. PerfermenTest18 单线程和多线程消耗时间比较
19. ConnectionPoolTest19 等待超时模式，

## 线程原子操作 thread-atomic
1. AtomicIntTest1 原子更新基本类型类
2. AtomicArray2   原子更新数组类
3. AtomicRef3 原子更新引用类型提供的类,可以解决更新多个变量的问题
4. AtomicStampedReferenceTest4 解决ABA问题 ：关注这杯水有几个人动过
5. AtomicReferenceFieldUpdater5 原子更新字段类
> cas 性能比锁的性能高一些
> cas:Compare And Swap就是比较并且交换的一个原子操作，由Cpu在指令级别上进行保证原子操作。
> 循环CAS：在一个（死）循环【for(;;)】里不断进行CAS操作，直到成功为止（也叫:自旋操作）


## Lock(显示锁)和 AQS
1. LockTemplete1 lock 锁 模版
2. RwLockTemplete2  读写锁 模版
3. Test3 synchronized 锁情况 和 ReentrantReadWriteLock 锁情况 性能比较
4. ConditionTemplete4  Condition接口和Lock配合来实现等待通知机制
5. BqTest5 lock 能过通知机制实现有界阻塞队列 测试
6. TestMyLock6 独占锁和共享锁测试

## 并发容器和并发工具类


