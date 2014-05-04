/*
 * ConditionVar.hpp
 *
 *  Created on: May 4, 2014
 *      Author: kerickso
 */

#ifndef MDS_CONDITIONVAR_HPP_
#define MDS_CONDITIONVAR_HPP_

#include <mdsplus/mdsplus.h>

#include <cstddef>

#if defined (MDS_WINDOWS)
#include <windows.h>
#elif defined (MDS_PTHREAD)
#include <pthread.h>
#endif

namespace MDSplus  {

class ConditionVar {
public:
	ConditionVar() {
		_create();
	}

	~ConditionVar() {
		_destroy();
	}

	void wait() {
		_wait();
	}

	bool waitTimeout(std::size_t msec) {
		return _waitTimeout(msec);
	}

	void notify() {
		_notify();
	}

private:
#if defined (MDS_PTHREAD)
	pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
	pthread_cond_t condition;

	void _create() {
		pthread_cond_init(&condition, NULL);
	}

	void _wait() {
		pthread_mutex_lock(&mutex);
		pthread_cond_wait(&condition, &mutex);
	}

	bool _waitTimeout(std::size_t msec) {
		timespec t;
		clock_gettime(CLOCK_REALTIME, &t);
		t.tv_sec += msec / 1000L;
		t.tv_nsec += msec % 1000L * 1000000L;
		pthread_mutex_lock(&mutex);
		return pthread_cond_timedwait(&condition, &mutex, &t) == 0 ? true:false;
	}

	void _notify() {
		pthread_cond_broadcast(&condition);
	}

	void _destroy() {
		pthread_cond_destroy(&condition);
	}
#elif defined (MDS_WINDOWS)
	HANDLE condition;

	void _create() {
		condition = CreateEvent(NULL, FALSE, FALSE, NULL);
	}

	void _wait() {
		WaitForSingleObject(condition, INFINITE);
	}

	bool _waitTimeout(std::size_t msec) {
		return WaitForSingleObject(condition, msec) == WAIT_OBJECT_0 ? true:false;
	}

	void _notify() {
		SetEvent(condition);
	}

	void _destroy() {
		CloseHandle(condition);
	}
#endif

};

}

#endif /* MDS_CONDITIONVAR_HPP_ */
