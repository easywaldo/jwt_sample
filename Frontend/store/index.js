import { MESSAGE } from './mutation-types'

export const state = () => ({
  message: null
})

export const mutations = {
  [MESSAGE](state, payload) {
    console.log('[mutations.js] [MESSAGE] → payload: ', payload)

    state.message = payload.message
    console.log('[mutations.js] [MESSAGE] → state.message: ', state.message)

    console.log()
  }
}

export const actions = {
  messageActions({ commit }, payload) {
    console.log('[actions.js] messageActions () → payload: ', payload)

    return this.$axios.get(`/api/v1/hello`).then((response) => {
      const { name } = response.data
      console.log('[actions.js] messageActions () → name: ', name)

      commit(MESSAGE, { message: name })
    })
  }
}
