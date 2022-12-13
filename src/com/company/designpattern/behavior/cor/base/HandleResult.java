package com.company.designpattern.behavior.cor.base;

/**
 * 链式处理处理结果
 *
 * @author ryan
 * @date 2022/12/12
 */
public class HandleResult<R> {

    private final R data;

    private final boolean next;

    private HandleResult(R r, boolean next) {
        this.data = r;
        this.next = next;
    }

    public R getData() {
        return data;
    }

    public boolean isNext() {
        return next;
    }

    /**
     * 还有next节点时，使用该方法，继续下个几点节点处理
     *
     * @return
     * @param <R>
     */
    public static <R> HandleResult<R> doNextResult() {
        return new HandleResult<>(null, true);
    }

    /**
     * 没有后续处理节点，使用该方法，返回处理结果
     *
     * @param r
     * @return
     * @param <R>
     */
    public static <R> HandleResult<R> doCurrentResult(R r) {
        return new HandleResult<>(r, false);
    }

}
