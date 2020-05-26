<template>
  <div class="wrapper">{{ message }}</div>
  <!-- // wrapper -->
</template>

<script>
import { mapState, mapActions } from 'vuex'

export default {
  async fetch() {
    console.log('async message() { .. }')
    await this.messageActions()
  },
  computed: {
    ...mapState(['message'])
  },
  methods: {
    ...mapActions(['messageActions'])
  }
}
</script>
